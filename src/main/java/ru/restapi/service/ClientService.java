package ru.restapi.service;

import ru.restapi.model.Client;

import java.util.List;

public interface ClientService {
    void create(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client, int id);

    boolean delete(int id);
}
