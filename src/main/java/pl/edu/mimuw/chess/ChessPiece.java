package pl.edu.mimuw.chess;

import java.util.List;

public interface ChessPiece {

  V2 getPosition();

  ChessColor getColor();

  void setPosition(V2 v);

  List<List<V2>> getPossibleMoves();

  String representation();
}