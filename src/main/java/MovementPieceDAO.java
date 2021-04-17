/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

/**
 *
 * @author larrysbarretot
 */
public class MovementPieceDAO implements IMovementPieceDAO {
	private MongoCollection<MovementPieceDTO> movements;
	
	public MovementPieceDAO() {
    this.movements = MongoDB.getConnection().getDB().getCollection("movements", MovementPieceDTO.class);
  }
	
	@Override
  public void create(MovementPieceDTO movement) {
    movement.setId(new ObjectId().toString());
    this.movements.insertOne(movement);
  }
	
	@Override
  public List<MovementPieceDTO> getAll() {
    return this.movements.find().into(new ArrayList<>());
  }
}
