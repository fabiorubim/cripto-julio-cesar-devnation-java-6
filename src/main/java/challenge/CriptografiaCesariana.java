package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if ( texto == ""){
            throw new IllegalArgumentException("Texto vazio!");
        } else if (texto == null){
            throw new NullPointerException("Texto nulo!");            
        }

        texto = texto.toLowerCase();
        int qtdChar = texto.length() - 1;
        byte numChar;
        StringBuilder newStringCipher = new StringBuilder();

        for (int i = 0; i <= qtdChar; i++) {
            numChar = (byte) texto.charAt(i);
            if (numChar == 32 | numChar == 46 | (numChar >= 48 & numChar <= 57)) {
                newStringCipher.append((char) numChar);
            } else {
                newStringCipher.append((char) (numChar + 3));
            }
        }

        return newStringCipher.toString().toLowerCase();
        
    }

    @Override
    public String descriptografar(String texto) {
        if ( texto == ""){
            throw new IllegalArgumentException("Texto vazio!");
        } else if (texto == null){
            throw new NullPointerException("Texto nulo!");            
        }

        texto = texto.toLowerCase();
        int qtdChar = texto.length() - 1;
        byte numChar;
        StringBuilder newStringUnCipher = new StringBuilder();

        for (int i = 0; i <= qtdChar; i++) {
            numChar = (byte) texto.charAt(i);
            if (numChar == 32 | numChar == 46 | (numChar >= 48 & numChar <= 57)) {
                newStringUnCipher.append((char) numChar);
            } else {
                newStringUnCipher.append((char) (numChar - 3));
            }
        }

        return newStringUnCipher.toString().toLowerCase();
    }

    public static void main(String[] args) {
        CriptografiaCesariana obj = new CriptografiaCesariana();
        //System.out.println(obj.criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado"));
        System.out.println(obj.descriptografar("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr"));
        //System.out.println(obj.descriptografar("130487"));
    }
}
