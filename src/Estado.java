public enum Estado {
    PAGADO("Pagado"), PENDIENTE_DE_PAGO("Pendiente de pago"), CANCELADO("Cancelado");

    private String status;

    Estado(String estatus) {
        this.status=estatus;
    }

    public String getStatus() {
        return status;
    }
}
