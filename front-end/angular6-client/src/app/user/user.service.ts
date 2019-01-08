import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

import {User} from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8088/users';
  // private userUrl = '/api';

  public getAllUsers() {
    return this.http.get<User[]>(this.userUrl);
  }

}
