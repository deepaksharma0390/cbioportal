package org.cbioportal.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class AlterationCountByProtein implements Serializable {

    private static final long serialVersionUID = 6732138112512977351L;

    private Integer entrezGeneId;
    private String hugoGeneSymbol;
    private String proteinChange;
    private Integer numberOfAlteredCases;
    private Integer numberOfProfiledCases;
    private BigDecimal mutationFrequency;

    public Integer getEntrezGeneId() {
        return entrezGeneId;
    }

    public void setEntrezGeneId(Integer entrezGeneId) {
        this.entrezGeneId = entrezGeneId;
    }

    public String getHugoGeneSymbol() {
        return hugoGeneSymbol;
    }

    public void setHugoGeneSymbol(String hugoGeneSymbol) {
        this.hugoGeneSymbol = hugoGeneSymbol;
    }

    public Integer getNumberOfAlteredCases() {
        return numberOfAlteredCases;
    }

    public void setNumberOfAlteredCases(Integer numberOfAlteredCases) {
        this.numberOfAlteredCases = numberOfAlteredCases;
    }

	public String getProteinChange() {
		return proteinChange;
	}

	public void setProteinChange(String proteinChange) {
		this.proteinChange = proteinChange;
	}

    public Integer getNumberOfProfiledCases() {
        return numberOfProfiledCases;
    }

    public void setNumberOfProfiledCases(Integer numberOfProfiledCases) {
        this.numberOfProfiledCases = numberOfProfiledCases;
    }

    public BigDecimal getMutationFrequency() {
        return mutationFrequency;
    }

    public void setMutationFrequency(BigDecimal mutationFrequency) {
        this.mutationFrequency = mutationFrequency;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
