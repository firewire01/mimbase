package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;

/**
 * Created by marlon on 4/17/17.
 */
@XmlClass(tagName = "Allergies")
public class Allergies {

    private SubstanceClass substanceClass;

    private ActiveComposition activeComposition;

    private ActiveCompositionGroup activeCompositionGroup;

    private Molecule molecule;

    private Product product;

    private Ggpi ggpi;

    private SpecificItem specificItem;

    private GenericItem genericItem;

    public SubstanceClass getSubstanceClass() {
        return substanceClass;
    }

    public void setSubstanceClass(SubstanceClass substanceClass) {
        this.substanceClass = substanceClass;
    }

    public ActiveComposition getActiveComposition() {
        return activeComposition;
    }

    public void setActiveComposition(ActiveComposition activeComposition) {
        this.activeComposition = activeComposition;
    }

    public ActiveCompositionGroup getActiveCompositionGroup() {
        return activeCompositionGroup;
    }

    public void setActiveCompositionGroup(ActiveCompositionGroup activeCompositionGroup) {
        this.activeCompositionGroup = activeCompositionGroup;
    }

    public Molecule getMolecule() {
        return molecule;
    }

    public void setMolecule(Molecule molecule) {
        this.molecule = molecule;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Ggpi getGgpi() {
        return ggpi;
    }

    public void setGgpi(Ggpi ggpi) {
        this.ggpi = ggpi;
    }

    public SpecificItem getSpecificItem() {
        return specificItem;
    }

    public void setSpecificItem(SpecificItem specificItem) {
        this.specificItem = specificItem;
    }

    public GenericItem getGenericItem() {
        return genericItem;
    }

    public void setGenericItem(GenericItem genericItem) {
        this.genericItem = genericItem;
    }
}
