package example.model;

import java.io.Serializable;
 
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.annotation.Region;
 
@Region(value = "Dog")
public class Dog implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Id
    private final Long id;

    private String breed;
     
    private String color;
     
    @PersistenceConstructor
    public Dog(Long id, String breed, String color) {
        this.id = id;
        this.breed = breed;
        this.color = color;
    }
 
    public String getBreed() {
        return breed;
    }
 
    public String getColor() {
        return color;
    }
     
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", color=" + color + "]";
    }
     
}