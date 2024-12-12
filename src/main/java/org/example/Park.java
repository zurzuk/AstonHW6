package org.example;
import java.util.ArrayList;
import java.util.List;

public class Park {
    public List<Attraction> attractions = new ArrayList<Attraction>();
    public Park() {
        for(int i = 0; i < 10; i++) {
            Attraction attr = new Attraction();
            this.attractions.add(attr);
        }
    }
    public class Attraction {
        String workHours;
        String price;
        public Attraction() {
            this.workHours = "09:00 - 18:00";
            this.price = "420 рублей 69 копеек";
        }
    }
}
