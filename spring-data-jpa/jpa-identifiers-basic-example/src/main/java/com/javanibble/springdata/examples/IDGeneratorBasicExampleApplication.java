package com.javanibble.springdata.examples;

import com.javanibble.springdata.examples.identifier.composite.InventoryPK;
import com.javanibble.springdata.examples.model.*;
import com.javanibble.springdata.examples.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class IDGeneratorBasicExampleApplication implements CommandLineRunner {

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private StoreRepository storeRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private StaffRepository staffRepository;

	@Autowired
	private InventoryRepository inventoryRepository;

	@Autowired
	private RentalRepository rentalRepository;

	public static void main(String[] args) {
		SpringApplication.run(IDGeneratorBasicExampleApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		log.info("\n 1. Save Country -> {}", countryRepository.save(Country.builder().name("Netherlands").population(Long.valueOf(17469635)).currency("Euro").build()));
		log.info("\n 2. Save City -> {}", cityRepository.save(City.builder().name("Amsterdam").country("Netherlands").latitude("52.377956").longitude("4.897070").build()));
		log.info("\n 3. Save Address -> {}", addressRepository.save(Address.builder().streetName("Impala").streetNumber("24").city("Potgietersrus").country("South Africa").postalCode("0601").build()));
		log.info("\n 4. Save Store -> {}", storeRepository.save(Store.builder().name("Blockbuster").build()));
		log.info("\n 5. Save Customer -> {}", customerRepository.save(Customer.builder().firstName("Joe").lastName("Soap").build()));
		log.info("\n 6. Save Staff -> {}", staffRepository.save(Staff.builder().firstName("Jane").lastName("Soap").build()));

		InventoryPK identifier = new InventoryPK(Long.valueOf(1L), Long.valueOf(2L));
		log.info("\n 7. Save Inventory -> {}", inventoryRepository.save(Inventory.builder().id(identifier).name("FilmInventory").build()));
		log.info("\n 8. Save Rental -> {}", rentalRepository.save(Rental.builder().rental_id(Long.valueOf(1L)).secondary_id(Long.valueOf(1L)).name("Rental 1").build()));
	}
}