package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class CollegeNew {

    private final Map<Student, Set<Subject>> students;

    public CollegeNew(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student st : students.keySet()) {
            if (account.equals(st.getAccount())) {
                rsl = Optional.of(st);
                break;
            }
        }
        return rsl;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> s = findByAccount(account);
        if (s.isPresent()) {
            Set<Subject> subjects = students.get(s.get());
            for (Subject subj : subjects) {
                if (name.equals(subj.getName())) {
                    rsl = Optional.of(subj);
                    break;
                }
            }
        }
        return rsl;
    }
}

