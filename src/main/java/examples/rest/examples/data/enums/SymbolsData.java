package examples.rest.examples.data.enums;

import lombok.Getter;

@Getter
public enum SymbolsData {

    UNDER_SCORE("_");

    private String symbol;

    SymbolsData(final String symbol) {
        this.symbol = symbol;
    }

}
