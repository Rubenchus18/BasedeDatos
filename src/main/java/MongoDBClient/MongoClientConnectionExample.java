package MongoDBClient;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import java.util.Random;

import org.bson.Document;

public class MongoClientConnectionExample {
    public static void main(String[] args) {
        String connectionString = "mongodb+srv://Rubenchus18:Ubenchus18yt#@atlascluster.zjvs2ol.mongodb.net/?retryWrites=true&w=majority&appName=AtlasCluster";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("Pokemons");
                MongoCollection<Document>collection=database.getCollection("Pokemon");
              
                 Document newPokemon= new Document("numero", 1)
                         .append("nombre", "Bulbasaur")
                         .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png")
                         .append("primerTipo", "Planta")
                         .append("segundoTipo", "Veneno")
                         .append("descripcion", "Puede estar días y días tomando el sol.")
                         .append("precio", new Random().nextInt(31) + 20)
                         .append("obtenido", false)
                         .append("altura", 0.7)
                         .append("peso", 6.9)
                         .append("ps", 45)
                         .append("ataque", 49)
                         .append("defensa", 49)
                         .append("ataqueEspecial", 65)
                         .append("defensaEspecial", 65)
                         .append("velocidad", 45);
                 collection.insertOne(newPokemon);
                 Document newPokemon2=new Document("numero", 2)
                         .append("nombre", "Venusaur")
                         .append("urlImagen", "https://img.pokemondb.net/artwork/venusaur.jpg")
                         .append("primerTipo", "Planta")
                         .append("segundoTipo", "Veneno")
                         .append("descripcion", "Venusaur es una especie de Pokémon de tipo planta/veneno.")
                         .append("precio", 35)
                         .append("obtenido", false)
                         .append("altura", 2.0)
                         .append("peso", 100.0)
                         .append("ps", 80)
                         .append("ataque", 82)
                         .append("defensa", 83)
                         .append("ataqueEspecial", 100)
                         .append("defensaEspecial", 100)
                         .append("velocidad", 80);
                collection.insertOne(newPokemon2);
                Document newPokemon3=new Document("numero", 3)
                        .append("nombre", "Ivysaur")
                        .append("urlImagen", "https://img.pokemondb.net/artwork/ivysaur.jpg")
                        .append("primerTipo", "Planta")
                        .append("segundoTipo", "Veneno")
                        .append("descripcion", "Ivysaur es una especie de Pokémon de tipo planta/veneno.")
                        .append("precio", 30)
                        .append("obtenido", false)
                        .append("altura", 1.0)
                        .append("peso", 13.0)
                        .append("ps", 60)
                        .append("ataque", 62)
                        .append("defensa", 63)
                        .append("ataqueEspecial", 80)
                        .append("defensaEspecial", 80)
                        .append("velocidad", 60);
                collection.insertOne(newPokemon3);
                Document newPokemon4=new Document("numero", 4)
                        .append("nombre", "Wartortle")
                        .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png")
                        .append("primerTipo", "Agua")
                        .append("segundoTipo", "")
                        .append("descripcion", "Suele ocultarse en el agua para cazar. Sus grandes orejas actúan como radares.")
                        .append("precio", new Random().nextInt(31) + 20)
                        .append("obtenido", false)
                        .append("altura", 1.0)
                        .append("peso", 22.5)
                        .append("ps", 59)
                        .append("ataque", 63)
                        .append("defensa", 80)
                        .append("ataqueEspecial", 30);
                collection.insertOne(newPokemon4);
                Document newPokemon5=new Document("numero", 5)
                        .append("nombre", "Squirtle")
                        .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png")
                        .append("primerTipo", "Agua")
                        .append("segundoTipo", "")
                        .append("descripcion", "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.")
                        .append("precio", new Random().nextInt(31) + 20)
                        .append("obtenido", false)
                        .append("altura", 0.5)
                        .append("peso", 9.0)
                        .append("ps", 44)
                        .append("ataque", 48)
                        .append("defensa", 65)
                        .append("ataqueEspecial", 50)
                        .append("defensaEspecial", 64)
                        .append("velocidad", 43);
                collection.insertOne(newPokemon5);
                Document newPokemon6=new Document("numero", 6)
                        .append("nombre", "Charizard")
                        .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png")
                        .append("primerTipo", "Fuego")
                        .append("segundoTipo", "Volador")
                        .append("descripcion", "Lanza llamas tan calientes que funden las rocas. Causa incendios forestales sin querer.")
                        .append("precio", new Random().nextInt(31) + 20)
                        .append("obtenido", false)
                        .append("altura", 1.7)
                        .append("peso", 90.5)
                        .append("ps", 78)
                        .append("ataque", 84)
                        .append("defensa", 78)
                        .append("ataqueEspecial", 109)
                        .append("defensaEspecial", 85)
                        .append("velocidad", 100);
                collection.insertOne(newPokemon6);
                Document newPokemon7=new Document("numero", 7)
                        .append("nombre", "Charmeleon")
                        .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png")
                        .append("primerTipo", "Fuego")
                        .append("segundoTipo", "")
                        .append("descripcion", "Si se enfada, la temperatura de su cola puede subir hasta 600 ºC.")
                        .append("precio", new Random().nextInt(31) + 20)
                        .append("obtenido", false)
                        .append("altura", 1.1)
                        .append("peso", 19.0)
                        .append("ps", 58)
                        .append("ataque", 64)
                        .append("defensa", 58)
                        .append("ataqueEspecial", 80)
                        .append("defensaEspecial", 65)
                        .append("velocidad", 80);
                collection.insertOne(newPokemon7);
                Document newPokemon8=new Document("numero", 8)
                        .append("nombre", "Charmander")
                        .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png")
                        .append("primerTipo", "Fuego")
                        .append("segundoTipo", "")
                        .append("descripcion", "Prefiere los lugares calientes. Dicen que cuando llueve le sale vapor de la punta de la cola.")
                        .append("precio", new Random().nextInt(31) + 20)
                        .append("obtenido", false)
                        .append("altura", 0.6)
                        .append("peso", 8.5)
                        .append("ps", 39)
                        .append("ataque", 52)
                        .append("defensa", 43)
                        .append("ataqueEspecial", 60)
                        .append("defensaEspecial", 50)
                        .append("velocidad", 65);
                collection.insertOne(newPokemon8);
                Document newPokemon9=new Document("numero", 9)
                		.append("nombre", "Blastoise")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png")
                        .append("primerTipo", "Agua")
                        .append("segundoTipo", "")
                        .append("descripcion", "Blastoise puede disparar chorros de agua a gran velocidad.")
                        .append("precio", 50)
                        .append("obtenido", false)
                        .append("altura", 1.6)
                        .append("peso", 85.5)
                        .append("ps", 79)
                        .append("ataque", 83)
                        .append("defensa", 100)
                        .append("ataqueEspecial", 85)
                        .append("defensaEspecial", 105)
                        .append("velocidad", 78);
                collection.insertOne(newPokemon9);
                Document newPokemon10=new Document("numero", 10)
                		.append("nombre", "Caterpie")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/010.png")
                        .append("primerTipo", "Bicho")
                        .append("segundoTipo", "")
                        .append("descripcion", "Caterpie tiene un cuerpo segmentado y una cabeza grande.")
                        .append("precio", 15)
                        .append("obtenido", false)
                        .append("altura", 0.3)
                        .append("peso", 2.9)
                        .append("ps", 45)
                        .append("ataque", 30)
                        .append("defensa", 35)
                        .append("ataqueEspecial", 20)
                        .append("defensaEspecial", 20)
                        .append("velocidad", 45);
                collection.insertOne(newPokemon10);
                Document newPokemon11=new Document("numero", 11)
                		.append("nombre", "Metapod")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/011.png")
                        .append("primerTipo", "Bicho")
                        .append("segundoTipo", "")
                        .append("descripcion", "Metapod tiene un caparazón muy duro.")
                        .append("precio", 20)
                        .append("obtenido", false)
                        .append("altura", 0.7)
                        .append("peso", 9.9)
                        .append("ps", 50)
                        .append("ataque", 20)
                        .append("defensa", 55)
                        .append("ataqueEspecial", 25)
                        .append("defensaEspecial", 25)
                        .append("velocidad", 30);
                collection.insertOne(newPokemon11);
                Document newPokemon12=new Document("numero", 12)
                		.append("nombre", "Butterfree")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/012.png")
                        .append("primerTipo", "Bicho")
                        .append("segundoTipo", "Volador")
                        .append("descripcion", "Butterfree puede volar largas distancias.")
                        .append("precio", 30)
                        .append("obtenido", false)
                        .append("altura", 1.1)
                        .append("peso", 32.0)
                        .append("ps", 60)
                        .append("ataque", 45)
                        .append("defensa", 50)
                        .append("ataqueEspecial", 90)
                        .append("defensaEspecial", 80)
                        .append("velocidad", 70);
                collection.insertOne(newPokemon12);
                Document newPokemon13=new Document("numero", 13)
                		.append("nombre", "Weedle")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/013.png")
                        .append("primerTipo", "Bicho")
                        .append("segundoTipo", "Veneno")
                        .append("descripcion", "Weedle tiene una pequeña trompa.")
                        .append("precio", 10)
                        .append("obtenido", false)
                        .append("altura", 0.3)
                        .append("peso", 3.2)
                        .append("ps", 40)
                        .append("ataque", 35)
                        .append("defensa", 30)
                        .append("ataqueEspecial", 20)
                        .append("defensaEspecial", 20)
                        .append("velocidad", 50);
                collection.insertOne(newPokemon13);
                Document newPokemon14=new Document("numero", 14)
                		.append("nombre", "Kakuna")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/014.png")
                        .append("primerTipo", "Bicho")
                        .append("segundoTipo", "Veneno")
                        .append("descripcion", "Kakuna permanece inmóvil mientras evoluciona.")
                        .append("precio", 15)
                        .append("obtenido", false)
                        .append("altura", 0.6)
                        .append("peso", 10.0)
                        .append("ps", 45)
                        .append("ataque", 25)
                        .append("defensa", 50)
                        .append("ataqueEspecial", 25)
                        .append("defensaEspecial", 25)
                        .append("velocidad", 35);
                collection.insertOne(newPokemon14);
                Document newPokemon15=new Document("numero", 15)
                		.append("nombre", "Beedrill")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/015.png")
                        .append("primerTipo", "Bicho")
                        .append("segundoTipo", "Veneno")
                        .append("descripcion", "Beedrill tiene tres aguijones venenosos.")
                        .append("precio", 35)
                        .append("obtenido", false)
                        .append("altura", 1.0)
                        .append("peso", 29.5)
                        .append("ps", 65)
                        .append("ataque", 90)
                        .append("defensa", 40)
                        .append("ataqueEspecial", 45)
                        .append("defensaEspecial", 80)
                        .append("velocidad", 75);
                collection.insertOne(newPokemon15);
                Document newPokemon16=new Document("numero", 16)
                		.append("nombre", "Pidgey")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/016.png")
                        .append("primerTipo", "Normal")
                        .append("segundoTipo", "Volador")
                        .append("descripcion", "Pidgey es muy común en áreas boscosas.")
                        .append("precio", 20)
                        .append("obtenido", false)
                        .append("altura", 0.3)
                        .append("peso", 1.8)
                        .append("ps", 40)
                        .append("ataque", 45)
                        .append("defensa", 40)
                        .append("ataqueEspecial", 35)
                        .append("defensaEspecial", 35)
                        .append("velocidad", 56);
                collection.insertOne(newPokemon16);
                Document newPokemon17=new Document("numero", 17)
                		.append("nombre", "Pidgeotto")
                		.append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/017.png")
                        .append("primerTipo", "Normal")
                        .append("segundoTipo", "Volador")
                        .append("descripcion", "Pidgeotto es muy territorial.")
                        .append("precio", 25)
                        .append("obtenido", false)
                        .append("altura", 1.1)
                        .append("peso", 30.0)
                        .append("ps", 63)
                        .append("ataque", 60)
                        .append("defensa", 55)
                        .append("ataqueEspecial", 50)
                        .append("defensaEspecial", 50)
                        .append("velocidad", 71);
               collection.insertOne(newPokemon17);
               Document newPokemon18=new Document("numero", 18)
            		   .append("nombre", "Pidgeot")
            		   .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/018.png")
                       .append("primerTipo", "Normal")
                       .append("segundoTipo", "Volador")
                       .append("descripcion", "Pidgeot tiene una velocidad increíble.")
                       .append("precio", 40)
                       .append("obtenido", false)
                       .append("altura", 1.5)
                       .append("peso", 39.5)
                       .append("ps", 83)
                       .append("ataque", 80)
                       .append("defensa", 75)
                       .append("ataqueEspecial", 70)
                       .append("defensaEspecial", 70)
                       .append("velocidad", 101);
               collection.insertOne(newPokemon18);
               Document newPokemon19=new Document("numero", 19)
            		   .append("nombre", "Rattata")
            		   .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/019.png")
                       .append("primerTipo", "Normal")
                       .append("segundoTipo", "")
                       .append("descripcion", "Rattata es muy tenaz y sobrevive en cualquier entorno.")
                       .append("precio", 10)
                       .append("obtenido", false)
                       .append("altura", 0.3)
                       .append("peso", 3.5)
                       .append("ps", 30)
                       .append("ataque", 56)
                       .append("defensa", 35)
                       .append("ataqueEspecial", 25)
                       .append("defensaEspecial", 35)
                       .append("velocidad", 72);
               collection.insertOne(newPokemon19);
               Document newPokemon20=new Document("numero", 20)
            		   .append("nombre", "Raticate")
            		   .append("urlImagen", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/020.png")
                       .append("primerTipo", "Normal")
                       .append("segundoTipo", "")
                       .append("descripcion", "Raticate tiene unos colmillos muy grandes.")
                       .append("precio", 25)
                       .append("obtenido", false)
                       .append("altura", 0.7)
                       .append("peso", 18.5)
                       .append("ps", 55)
                       .append("ataque", 81)
                       .append("defensa", 60)
                       .append("ataqueEspecial", 50)
                       .append("defensaEspecial", 70)
                       .append("velocidad", 97);
               collection.insertOne(newPokemon20);
                System.out.println("Pokemon insertado");
                
                /*Document foundPokemon=collection.find(Filters.eq("name","Piggi")).first();
                if(foundPokemon!=null) {
                	System.out.println(foundPokemon.getString("name")+" "+foundPokemon.getString("type"));
                }else {
                	System.out.println("Pokemon not found");
                }*/
               /* collection.updateOne(Filters.eq("name","Piggi"),Updates.set("level", 26));
                System.out.println("Pokemon Update");
                Document updatePokemon=collection.find(Filters.eq("name","Piggi")).first();
                if(updatePokemon!=null) {
                	System.out.println("Updated Pokemon " + updatePokemon.toJson());
                }else {
                	System.out.println("Pokemon not found");
                }*/
                /*collection.deleteOne(Filters.eq("name","Piggi"));
                System.out.println("Pokemon deleted");
                
                Document deletedPokemon=collection.find(Filters.eq("name","Piggi")).first();
                if(deletedPokemon!=null) {
                	System.out.println("Pokemon still exist " + deletedPokemon.toJson());
                }else {
                	System.out.println("Pokemon succesfull deleted");	
                }*/
                }  
        	catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
}
