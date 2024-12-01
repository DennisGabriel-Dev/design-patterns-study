package factory.domain;

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}
