package movies.data;

import movies.model.Movie;

import java.util.Collection;

import movies.model.Genre;
import movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MovieRepositoryJDBC implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = { id };

        return jdbcTemplate.queryForObject("SELECT * FROM movies WHERE id = ?", args, movieMapper);

    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }

    private static RowMapper<Movie> movieMapper = (rs, rowNum) ->
            new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre")));
}
