package thuc_hanh.mvc.service;

import java.util.List;

public interface IPersonService<E> {

    List<E> getAll();

    List<E> getAllSortById();
}
