package net.sanhee.pieces.property;

public enum UnitType {
    PAWN('P'),
    ROOK('R'),
    KNIGHT('N'),
    BISHOP('B'),
    QUEEN('Q'),
    KING('K'),
    NONE('.');

    private final char unitRepresentation;

    UnitType(char mark) {
        this.unitRepresentation = mark;
    }

    public static char getMark(UnitColor color, String unitClassName) {
        final char mark;

        switch (color) {
            case BLACK:
                mark = Character.toUpperCase(UnitType.valueOf(unitClassName.toUpperCase()).unitRepresentation);
                break;
            case WHITE:
                mark = Character.toLowerCase(UnitType.valueOf(unitClassName.toUpperCase()).unitRepresentation);
                break;
            case NONE:
                mark = UnitType.valueOf(unitClassName.toUpperCase()).unitRepresentation;
                break;
            default:
                mark = ' ';
        }
        return mark;
    }
}
