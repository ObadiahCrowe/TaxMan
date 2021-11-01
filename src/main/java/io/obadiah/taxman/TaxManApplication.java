package io.obadiah.taxman;

import io.obadiah.taxman.tax.TaxRate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxManApplication {

    public static void main(String[] args) {
        System.out.println("Taxable income for £12,000: " + TaxRate.getTaxableIncome(12_000));
        System.out.println("Taxable income for £13,000: " + TaxRate.getTaxableIncome(13_000));
        System.out.println("Taxable income for £43,200: " + TaxRate.getTaxableIncome(43_200));

        //SpringApplication.run(TaxManApplication.class, args);
    }

}
