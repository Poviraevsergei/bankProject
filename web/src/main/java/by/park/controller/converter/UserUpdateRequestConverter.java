package by.park.controller.converter;

import by.park.controller.request.UpdateUserRequest;
import by.park.domain.User;
import org.springframework.stereotype.Component;

import static java.util.Optional.ofNullable;

@Component
public class UserUpdateRequestConverter extends UserRequestConverter<UpdateUserRequest, User> {
    @Override
    public User convert(UpdateUserRequest request) {
        User user = ofNullable(entityManager.find(User.class, request.getId())).get();
        user.setDeleted(request.getDeleted());
        return doConvert(user, request);
    }
}