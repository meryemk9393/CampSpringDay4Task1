package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository{
	
List<Language> langs;
	
	public InMemoryLanguageRepository() {
		langs=new ArrayList<Language>();
		langs.add(new Language(1,"C"));
		langs.add(new Language(2,"Java"));
		langs.add(new Language(3,"C++"));
		langs.add(new Language(4,"Python"));
		langs.add(new Language(5,"C#"));
		
		
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return langs;
	}

}
