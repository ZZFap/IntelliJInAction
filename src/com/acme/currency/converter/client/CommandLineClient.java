package com.acme.currency.converter.client;

import com.acme.currency.converter.service.CurrencyExchangeServiceFactory;
import com.acme.currency.converter.service.ICurrencyExchangeService;

/**
 *
 */
public class CommandLineClient {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Requested parameters: <source currency code> <target currency code>");
        } else {
            ICurrencyExchangeService service = CurrencyExchangeServiceFactory.getService();
            double rate = service.requestCurrentRate(args[0], args[1]);
            System.out.println("Rate is "+rate);
        }
    }

    /**
     *
     */
    public static void ignore() {
        System.out.println("CommandLineClient.ignore");
    }
}
