package mission5_221104.ex03Model;

public class Customer {
    private String name;
    private Integer account;

    public Customer(String name, Integer account) {
        this.name = name;
        this.account = account;
    }

    public void orderBeverage(Customer customer, Caffe caffe, Beverage beverage) {
        Integer charge = customer.getAccount() - beverage.getPrice();
        if(charge < 0) { return; }
        customer.setAccount(charge);

        String message = customer.getName() + "님의 남은 돈은 "+ charge + "원 입니다."
                + caffe.getName() + " 에서 " + beverage.getName() + "를 마셨습니다.";
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }
}
