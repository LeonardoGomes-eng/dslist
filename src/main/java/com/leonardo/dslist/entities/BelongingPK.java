package com.leonardo.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class BelongingPK {
    
    @ManyToOne
    @JoinColumn(name = "id_game")
    private Game game;
    
    @ManyToOne
    @JoinColumn(name = "id_list")
    private GameList list;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.game);
        hash = 37 * hash + Objects.hashCode(this.list);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BelongingPK other = (BelongingPK) obj;
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return Objects.equals(this.list, other.list);
    }
}
