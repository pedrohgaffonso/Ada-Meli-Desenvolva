public final class SegurancaUtils {
    private SegurancaUtils() {}

    public static boolean validarSenhaForte(String senha) {
        if (senha == null || senha.length() <= 8) {
            return false;
        }
        return senha.matches(".*[0-9].*");
    }
}