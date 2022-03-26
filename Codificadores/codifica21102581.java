package Codificadores;

public class codifica21102581 implements Codifica {

    private int multi = 5;

    public String getNomeAutor() {
        return "Lorenzo T Olivera";
    }

    public String getMatriculaAutor() {
        return "21102581";
    }

    @Override
    public String codifica(String louco) {
        String codificada = "";
        for (int i = 0; i < louco.length(); i++) {
            codificada += Integer.toString(this.multi * ((int) louco.charAt(i)));
            codificada += " ";
        }
        return codificada;
    }

    @Override
    public String decodifica(String louco) {
        String codificada = "";
        String[] louca = louco.split(" ");
        for (int i = 0; i < louca.length; i++) {
            codificada += (char) ((Integer.parseInt(louca[i])) / this.multi);
        }

        return codificada;
    }

}