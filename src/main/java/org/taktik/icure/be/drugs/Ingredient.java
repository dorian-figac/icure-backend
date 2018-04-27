/*  * Copyright (C) 2018 Taktik SA  *  * This file is part of iCureBackend.  *  * iCureBackend is free software: you can redistribute it and/or modify  * it under the terms of the GNU General Public License as published by  * the Free Software Foundation, either version 2 of the License, or  * (at your option) any later version.  *  * iCureBackend is distributed in the hope that it will be useful,  * but WITHOUT ANY WARRANTY; without even the implied warranty of  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the  * GNU General Public License for more details.  *  * You should have received a copy of the GNU General Public License  * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.  */

package org.taktik.icure.be.drugs;
// Generated Feb 27, 2008 11:38:04 AM by Hibernate Tools 3.2.0.CR1


import java.util.HashSet;
import java.util.Set;

import org.taktik.icure.be.drugs.dto.IngredientId;

/**
 * Ingredient generated by hbm2java
 */
public class Ingredient  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
     private IngredientId id;
     private String name;
     private String note;
     private Boolean deleted;
     private String type;
     private Set<Composition> compositions = new HashSet<Composition>(0);

    public Ingredient() {
    }

   
    public IngredientId getId() {
        return this.id;
    }
    
    public void setId(IngredientId id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set<Composition> getCompositions() {
        return this.compositions;
    }
    
    public void setCompositions(Set<Composition> compositions) {
        this.compositions = compositions;
    }




}


