package graphicCreator;

public class graphicCreatorFactory {
	public static graphicCreator create(boolean isGrafico) {
		return new graphicCreator(isGrafico);
	}
}
