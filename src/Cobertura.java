public enum Cobertura {
    OBRA_SOCIAL("Obra social"), PARTICULAR("Particular");
    private String cobert;

    Cobertura(String cob) {
        this.cobert = cob;
    }

    public String getCobert() {
        return cobert;
    }
}
