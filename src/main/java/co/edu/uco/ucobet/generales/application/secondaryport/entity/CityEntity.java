package co.edu.uco.ucobet.generales.application.secondaryport.entity;

import co.edu.uco.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "city")
public class CityEntity{

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "state")
    private StateEntity state;

    public CityEntity(final UUID id, final String name, final StateEntity state) {
        setId(id);
        setName(name);
        setState(state);
    }

    protected CityEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setState(StateEntity.create());
    }

    static final CityEntity create() {
            return new CityEntity();
    }

    public static final CityEntity create(final UUID id, final String name, final StateEntity state) {
        return new CityEntity(id, name, state);
    }

    public static final CityEntity create(final UUID id) {
        return new CityEntity(id, TextHelper.EMPTY, StateEntity.create());
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = TextHelper.applyTrim(name);
    }

    public StateEntity getState() {
        return state;
    }

    public void setState(final StateEntity state) {
        this.state = ObjectHelper.getDefault(state, StateEntity.create());
    }

}
