package Assig1;

class Customer {
    int cid;
    String cname;
    double billAmount;

    Customer(int id, String name, double bill) {
        cid = id;
        cname = name;
        billAmount = bill;
    }

    public static void main(String args[]) {
        Customer c[] = {
            new Customer(1, "Amit", 5000),
            new Customer(2, "Sneha", 2000),
            new Customer(3, "Rahul", 4000)
        };

        for(int i = 0; i < c.length - 1; i++) {
            for(int j = i + 1; j < c.length; j++) {
                if(c[i].billAmount > c[j].billAmount) {
                    Customer temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        for(Customer x : c)
            System.out.println(x.cid + " " + x.cname + " " + x.billAmount);
    }
}