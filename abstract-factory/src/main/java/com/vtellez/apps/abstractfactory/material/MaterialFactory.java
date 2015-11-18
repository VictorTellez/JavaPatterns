package com.vtellez.apps.abstractfactory.material;

/**
 * Created by Victor Tellez on 13/11/2015.
 */
public class MaterialFactory {

    /**
     * Material type
     */
    public enum MaterialType {
        DENIM, LEATHER, LYCRA;
    }

    public static Material getMaterial(MaterialType materialType){

        if(materialType == null){
            return null;
        }

        if(materialType == MaterialType.DENIM){
            return new Denim();

        }else if(materialType == MaterialType.LEATHER){
            return new Leather();

        }else if(materialType == MaterialType.LYCRA){
            return new Lycra();
        }
        return null;
    }
}
