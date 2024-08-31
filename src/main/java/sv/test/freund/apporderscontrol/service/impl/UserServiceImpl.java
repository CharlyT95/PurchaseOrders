package sv.test.freund.apporderscontrol.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.test.freund.apporderscontrol.model.User;
import sv.test.freund.apporderscontrol.repository.UserRepository;
import sv.test.freund.apporderscontrol.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UsuarioService {

    @Autowired
    private UserRepository usuarioRepository;

    @Override
    public List<User> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void Create(User user) {
        usuarioRepository.saveAndFlush(user);
    }

    @Override
    public void Update(User user) {
        usuarioRepository.saveAndFlush(user);

    }
}
