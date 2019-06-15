package pl.sda.springtrening;

import lombok.Getter;

@Getter
public enum Countries {

    USA("Stany"),GERMANY("Niemcy"),POLAND("Polska");  //każdy z tych elementów jest singletonem czyli unikatowe
    private String plName;

    Countries(String plName) {
        this.plName = plName;

    }
}
