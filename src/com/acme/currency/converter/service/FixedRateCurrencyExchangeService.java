package com.acme.currency.converter.service;

import java.util.Objects;

public class FixedRateCurrencyExchangeService implements ICurrencyExchangeService {
    private double rate;

    public FixedRateCurrencyExchangeService() {
        this.rate = 1.5;

    }

    @Override
    public double requestCurrentRate(String fromCurrency, String toCurrency) {
        double answer = 0;
        if (Objects.equals(fromCurrency, "USD"))
            if (Objects.equals(toCurrency, "CDN")) answer=rate;
        if (Objects.equals(fromCurrency, "CDN"))
            if (Objects.equals(toCurrency, "USD")) answer=1.0/rate;
        return answer;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FixedRateCurrencyExchangeService that = (FixedRateCurrencyExchangeService) o;

        return Double.compare(that.rate, rate) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(rate);
        return (int) (temp ^ (temp >>> 32));
    }
}
