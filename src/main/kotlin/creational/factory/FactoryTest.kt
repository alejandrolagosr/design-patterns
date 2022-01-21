package creational.factory

fun main() {
    println("--- Factory Example ---")

    val currencyFactory = CurrencyFactoryImpl()

    val mexicoCurrency = currencyFactory.getCurrencyForCountry(Country.Mexico)
    println("Mexico currency is: ${mexicoCurrency.code}")

    val usaCurrency = currencyFactory.getCurrencyForCountry(Country.USA)
    println("USA currency is: ${usaCurrency.code}")

    val spainCurrency = currencyFactory.getCurrencyForCountry(Country.Spain)
    println("Spain currency is: ${spainCurrency.code}")

    val canadaCurrency = currencyFactory.getCurrencyForCountry(Country.Canada)
    println("Canada currency is: ${canadaCurrency.code}")

    println("--- --- ---")
}