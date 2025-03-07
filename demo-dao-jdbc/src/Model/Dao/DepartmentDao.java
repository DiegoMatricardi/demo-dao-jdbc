package Model.Dao;

import Model.Entities.Departament;

import java.util.List;

public interface DepartmentDao {
    void insert(Departament departament);
    void update(Departament departament);
    void deleteById(Integer id);
    Departament findById(Integer id);
    List<Departament> findAll();
}
