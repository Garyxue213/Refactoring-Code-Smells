public class TaxableItem extends Item {
    private double taxRate = 7;

    public TaxableItem(String name, double price, int quantity, DiscountType discountType, double discountAmount) {
        super(name, price, quantity, discountType, discountAmount);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double rate) {
        if (rate >= 0) {
            taxRate = rate;
        }
    }

    @Override
    public double getCostWithTax() {
        double cost = super.getCost();
        double tax = taxRate / 100.0 * cost;
        return cost + tax;
    }

    @Override
    public boolean isGiftCard() {
        return false;
    }
}
