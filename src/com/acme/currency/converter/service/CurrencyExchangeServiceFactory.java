package com.acme.currency.converter.service;
/**
 * This factory is responsible for providing a valid currency
 * exchange service upon request.
 */
public class CurrencyExchangeServiceFactory {
    public static ICurrencyExchangeService getService() {
// The body of this method should decide on and return
// a valid CurrencyExchangeService of some sort.
// Until we either write one (or are provided one),
// we can only return null here.
        return new FixedRateCurrencyExchangeService();
    }
}