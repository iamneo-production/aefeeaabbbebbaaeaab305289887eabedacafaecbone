package com.examly.springapp.repositories;
public class BillRepo extends JpaRepository<Bill, Integer> {
    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Optional<City> findById(Long id) {

        return cityRepository.findById(id);
    }}
