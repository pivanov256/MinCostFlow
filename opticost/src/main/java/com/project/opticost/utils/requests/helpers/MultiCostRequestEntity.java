package com.project.opticost.utils.requests.helpers;

public class MultiCostRequestEntity {
    private String selectedPlan;
    private String fromCity;
    private String toCity;
    private Integer cargo;

    public String getSelectedPlan() {
        return selectedPlan;
    }

    public void setSelectedPlan(String selectedPlan) {
        this.selectedPlan = selectedPlan;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }
}
