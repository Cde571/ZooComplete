package controller;

import model.Client;

import java.util.ArrayList;

public class ManagementClient {
    private ArrayList<Client> listClient = new ArrayList<>();
    public boolean isExistClient(String id){
        for (int i = 0; i < listClient.size(); i++){
            String idClient = listClient.get(i).getId();
            if (idClient.equals(id)) return true;
        }
        return false;
    }
    public void addClient(Client client) {
        listClient.add(client);
    }
    public Client getClient(String id) {
        if (isExistClient(id)) {
            for (int i = 0; i < listClient.size(); i++) {
                Client cliente = listClient.get(i);
                if (cliente.getId().equals(id)) {
                    return cliente;
                }
            }
        }
        return new Client("0","0", "0", "0", 0, 0);
    }
    /*public int countSuscription() {
        int count = 0;
        for (int i = 0; i < this.listClient.size(); i++) {
            if (this.listClient.get(i).isSubscribed()) {
                count++;
            }
        }
        return count;
    }*/

    public void updateNumOfBuys(String id, int numOfBuys) {
        Client cliente = getClient(id);
        cliente.setCountOfVisit(cliente.getCountOfVisit()+1);
        cliente.setArticlesAccumulator(cliente.getArticlesAccumulator()+numOfBuys);
    }

    public int countClient() {
        return this.listClient.size();
    }

}
