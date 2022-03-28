package Codificadores;
//O algoritimo codifcia a String transformando os caracteres dela em valores da tabela ASCII e multiplica pela valor da chave no caso 5.
//No metodo decdifca o algoritimo separa a string em um array de strings e decodifica eles transformando em sua frase original
public class codifica21102581 implements Codifica {

    private int multi = 5;

    public String getNomeAutor() {
        return "Lorenzo T Olivera";
    }

    public String getMatriculaAutor() {
        return "21102581";
    }
//metodo codifdica cria string(string codificada) e depois pega cada caracter da string passada e o transforma em valor ASCII.
//Depois multiplica pelo valor da chave(variavel multi) e no final acresenta um espaço e retorna a string codificada.
    @Override
    public String codifica(String louco) {
        String codificada = "";//cria a string
        for (int i = 0; i < louco.length(); i++) {//For percorrendo todos os carcteres da string 
            codificada += Integer.toString(this.multi * ((int) louco.charAt(i)));//Transforma o caracter em um valor inteiro da tabela ASCII multiplica pela chave e adiciona na string.
            codificada += " ";//Adiciona um espaço após ele adicionar o int a string.
        }
        return codificada;//retorna a string codificada
    }
//metodo decodifica cria a string e a transforma em um array splitando ela em um espaço no caso o codifica+= ""; da linha 21.
    @Override
    public String decodifica(String louco) {
        String codificada = "";//cria a string
        String[] louca = louco.split(" ");//Separa a string num array de strings que resumindo é igual as letras codificadas no metodo acima.
        for (int i = 0; i < louca.length; i++) {//For percorendo todos os valores do array criado.
            codificada += (char) ((Integer.parseInt(louca[i])) / this.multi);//Aqui  ele transforma o valor do array em que está em um int e o divide pela chave(variavel multi)
                                                                             //depois transforma ele em char
        }

        return codificada;// retorna a string codificada
    }

}