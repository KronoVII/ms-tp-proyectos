package co.edu.uco.ucobet.generales.application.secondaryport.entity;

import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "country")
public final class CountryEntity{

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    public CountryEntity(final UUID id, final String name) {
        setId(id);
        setName(name);
    }

    protected CountryEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    static final CountryEntity create() {
            return new CountryEntity();
    }

    public static final CountryEntity create(final UUID id, final String name) {
        return new CountryEntity(id, name);
    }

    public static final CountryEntity create(final UUID id) {
        return new CountryEntity(id, TextHelper.EMPTY);
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
}
