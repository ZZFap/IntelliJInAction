package com.acme.currency.converter.service;

public class FixedRateCurrencyExchangeService implements ICurrencyExchangeService {
    private double rate;

    public FixedRateCurrencyExchangeService() {
        this.rate = 1.5;

    }

    @Override
    public double requestCurrentRate(String fromCurrency, String toCurrency) {
        double answer = 0;
        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {   case "CDN":                 answer = rate;                  break;      }
                break;
            case "CDN":
                switch (toCurrency) {   case "USD":                 answer = 1.0 / rate;            break;      }
                break;
            case "XXX":
                switch (toCurrency) {   case "USD":                 answer = 1.0 / rate;            break;      }
                break;
        }
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
