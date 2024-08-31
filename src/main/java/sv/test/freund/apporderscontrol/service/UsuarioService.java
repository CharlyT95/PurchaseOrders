package sv.test.freund.apporderscontrol.service;

import sv.test.freund.apporderscontrol.model.User;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public List<User> findAll();
    public Optional<User> findById(Integer id);
    public void Create(User user);

    public void Update(User user);
}
