package secao19.ExercicioResolvidoSet.application;

import java.util.Date;

public class User {
    private String name;
    private Date acess;

    public User(){}

    public User(String name, Date acess) {
        this.name = name;
        this.acess = acess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAcess() {
        return acess;
    }

    public void setAcess(Date acess) {
        this.acess = acess;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}
