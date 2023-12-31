// Generated by Dagger (https://dagger.dev).
package com.example.domain.useCase;

import com.example.domain.repository.UserGitRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetUserProfileInfoUseCase_Factory implements Factory<GetUserProfileInfoUseCase> {
  private final Provider<UserGitRepository> repositoryProvider;

  public GetUserProfileInfoUseCase_Factory(Provider<UserGitRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetUserProfileInfoUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetUserProfileInfoUseCase_Factory create(
      Provider<UserGitRepository> repositoryProvider) {
    return new GetUserProfileInfoUseCase_Factory(repositoryProvider);
  }

  public static GetUserProfileInfoUseCase newInstance(UserGitRepository repository) {
    return new GetUserProfileInfoUseCase(repository);
  }
}
