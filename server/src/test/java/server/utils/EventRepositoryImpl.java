package server.utils;

import commons.Event;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import server.database.EventRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class EventRepositoryImpl implements EventRepository {
    List<Event> events = new ArrayList<>();
    @Override
    public void flush() {

    }

    @Override
    public <S extends Event> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Event> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Event> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Event getOne(Long aLong) {
        return null;
    }

    @Override
    public Event getById(Long aLong) {
        return events.stream().filter(x -> x.getId().equals(aLong)).findAny().orElse(null);
    }

    @Override
    public Event getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Event> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Event> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Event> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Event> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Event> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Event> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Event, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Event> S save(S entity) {
        if(events.stream().anyMatch(x -> Objects.equals(x.getId(),entity.getId()))) {
            Event en = events.stream().filter(x -> Objects.equals(x.getId(),entity.getId())).findAny().get();
            en.setDateOfCreation(entity.getDateOfCreation());
            en.setExpList(entity.getExpList());
            en.setLastUpdate(entity.getLastUpdate());
            en.setPrtList(entity.getPrtList());
            return (S)en;
        }
        events.add(entity);
        return entity;
    }

    @Override
    public <S extends Event> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Event> findById(Long aLong) {
        return events.stream().filter(x -> Objects.equals(x.getId(), aLong)).findAny();
    }

    @Override
    public boolean existsById(Long aLong) {
        return events.stream().anyMatch(x -> x.getId().equals(aLong));
    }

    @Override
    public List<Event> findAll() {
        return events;
    }

    @Override
    public List<Event> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        events.remove(events.stream().filter(x -> Objects.equals(x.getId(), aLong)).findAny().orElse(null));
    }

    @Override
    public void delete(Event entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Event> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Event> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Event> findAll(Pageable pageable) {
        return null;
    }
}
