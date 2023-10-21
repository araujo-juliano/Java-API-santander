package dio.santander.santanderbootcamp.service;

import dio.santander.santanderbootcamp.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}