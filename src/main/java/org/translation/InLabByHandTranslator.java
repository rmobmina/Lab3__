package org.translation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// modify this class so that it also supports the Spanish language code "es" and
// one more language code of your choice. Each member of your group should add
// support for one additional language code on a branch; then push and create a pull request on GitHub.

/**
 * An implementation of the Translator interface which translates
 * the country code "can" to several languages.
 */
public class InLabByHandTranslator implements Translator {

    /**
     * Returns the language abbreviations for all languages whose translations are
     * available for the given country.
     *
     * @param country the country
     * @return list of language abbreviations which are available for this country
     */
    public static final String CANADA = "can";
    private static String countryCode = "can";

    @Override
    public List<String> getCountryLanguages(String country) {
        if (countryCode.equals(country)) {
            return new ArrayList<>(List.of("de", "en", "zh"));
        }
        return new ArrayList<>();
    }

    /**
     * Returns the country abbreviations for all countries whose translations are
     * available from this Translator.
     *
     * @return list of country abbreviations for which we have translations available
     */
    @Override
    public List<String> getCountries() {
        return new ArrayList<>(List.of(countryCode));
    }

    /**
     * Returns the name of the country based on the specified country abbreviation and language abbreviation.
     *
     * @param country  the country
     * @param language the language
     * @return the name of the country in the given language or null if no translation is available
     */
    @Override
    public String translate(String country, String language) {
        if (!country.equals(countryCode)) {
            return null;
        }

        Map<String, String> translations = new HashMap<>();
        translations.put("de", "Kanada");
        translations.put("en", "Canada");
        translations.put("zh", "加拿大");

        return translations.getOrDefault(language, null);
    }
}
