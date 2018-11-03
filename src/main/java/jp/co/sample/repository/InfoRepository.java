package jp.co.sample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.Info;

@Repository
public class InfoRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Info> USER_ROW_MAPPER = (rs, i) -> {

		Info info = new Info();
		info.setId(rs.getInt("id"));
		info.setName(rs.getString("name"));
		info.setAge(rs.getInt("age"));
		info.setAddress(rs.getString("address"));
		return info;
	};

	public Info load(Integer id) {
		String sql = "select id,name,age,address from info where id = :id order by id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		Info info = template.queryForObject(sql, param, USER_ROW_MAPPER);

		return info;
	}

}
