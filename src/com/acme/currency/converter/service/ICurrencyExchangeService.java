package com.acme.currency.converter.service;

/**
 * This interface defines the standard API for all currency
 * exchange services. All currency exchange services, regardless
 * of implementation, will adhere to this interface.
 */
public interface ICurrencyExchangeService {
/**
 * Requests the current exchange rate from one currency
 * to another.
 * @param fromCurrency the original Currency
 * @param toCurrency the 'destination' or final Currency
 * @return the currency exchange rate
 */

    double requestCurrentRate(String fromCurrency,
                              String toCurrency);
}