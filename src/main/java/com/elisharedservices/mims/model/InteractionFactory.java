package com.elisharedservices.mims.model;

/**
 * Created by marlon on 4/22/17.
 */
public class InteractionFactory {
    public static InteractionType create(InteractionTypeEnum type){

        if(type == InteractionTypeEnum.REFERENCES){

            return new References();
        }else if(type == InteractionTypeEnum.DUPLICATE_INGREDIENT){
            return new DuplicateIngredient();

        }else if(type == InteractionTypeEnum.DUPLICATE_THERAPY){

            return new DuplicateTherapy();

        }
        return null;
    }
}
