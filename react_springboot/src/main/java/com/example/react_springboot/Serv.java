
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Serv {

    private final Repo repository;

    public Serv(Repo repository) {
        this.repository = repository;
    }

    public Entity getEntityById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public String findNameById(Integer id) {
        Entity entity = repository.findById(id).orElse(null);
        if (entity != null) {
            return entity.getName();
        } else {
            return null;
        }
    }

    public Entity saveEntity(Entity entity) {
        return repository.save(entity);
    }

}
